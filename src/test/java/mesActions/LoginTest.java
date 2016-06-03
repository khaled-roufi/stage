package mesActions;

import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.StrutsTestCase;

/**
 * Created by admin on 01/04/2015.
 */
public class LoginTest extends StrutsTestCase {

    public void testKOname(){

        request.setParameter("name","amine");
        request.setParameter("lastname","A");
        request.setParameter("mail","mail@g.com");
        request.setParameter("birthday","10/10/1992");

        ActionProxy a = getActionProxy("/valider.action");

      /**  ActionSupport action = (ActionSupport) a.getAction();
        action.getFieldErrors();  **/

        try {
            String s = a.execute();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
