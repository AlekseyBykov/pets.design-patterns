//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.structural.adapter;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-03
 */
public class SimpleHdmiSocket implements HdmiSocket {
    @Override
    public String getVideoSignal() {
        return "Video signal: Maximum resolution limited by available bandwidth";
    }
}