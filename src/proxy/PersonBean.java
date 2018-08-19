package proxy;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/19
 * Time: 0:03
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    String getHotOrNotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
}