package proxy;

import java.text.DecimalFormat;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/19
 * Time: 0:07
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class PersonBeanImpl implements PersonBean {
    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount;

    public PersonBeanImpl(String name, String gender, String interests, int rating, int ratingCount) {
        this.name = name;
        this.gender = gender;
        this.interests = interests;
        this.rating = rating;
        this.ratingCount = ratingCount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public String getHotOrNotRating() {
        DecimalFormat df = new DecimalFormat("0.00");
        if (ratingCount == 0) return "0";
        return df.format((float)rating / ratingCount);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }
}