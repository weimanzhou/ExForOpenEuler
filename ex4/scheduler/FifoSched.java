package scheduler;

/**
 * @author Ayase
 * @date 2021/4/17-15:04
 */
public class FifoSched extends Scheduler{
    /**
     * 调度
     * @return
     */
    @Override
    public void schedule() {
        if(nowProcess == null) {
            if(!pList.isEmpty()) {
                nowProcess = pList.get(0);
                pList.remove(0);
            }
        }
    }
}
