package object_pool;

import java.util.LinkedList;
import java.util.List;

public class Pool {
    List<PooledObject> free = new LinkedList<>();
    List<PooledObject> used = new LinkedList<>();

    PooledObject getPooledObject() {
        if (free.isEmpty()) {
            PooledObject pooledObject = new PooledObject();
            free.add(pooledObject);
            return pooledObject;
        }
        used.add(free.get(free.size() - 1));
        free.remove(free.size() - 1);
        return used.get(used.size() - 1);
    }

    void setFree(PooledObject pooled) {
        free.add(pooled);
        used.remove(pooled);
    }
}

class PooledObject {

}