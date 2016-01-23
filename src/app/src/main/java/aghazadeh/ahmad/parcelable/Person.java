package aghazadeh.ahmad.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 890683 on 1/23/2016.
 */
public class Person implements Parcelable  {

    private String name;
    private String surname;
    private int age;

    protected Person(Parcel in) {
        name = in.readString();
        surname = in.readString();
        age = in.readInt();
    }
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }
        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };
    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(surname);
        dest.writeInt(age);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
