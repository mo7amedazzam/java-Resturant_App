package relative.alaqsa.edu.restaurant;


import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    String name;
    int Ivmeals;

    protected User(Parcel in) {
        name = in.readString();
        Ivmeals = in.readInt();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.Ivmeals = image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return Ivmeals;
    }

    public User(String name, int image) {
        this.name = name;
        this.Ivmeals = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(Ivmeals);
    }
}
