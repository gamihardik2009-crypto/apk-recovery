package v;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1352f implements Parcelable {
    public static final Parcelable.Creator<C1352f> CREATOR = new C1351e();

    /* renamed from: h, reason: collision with root package name */
    public final int f11343h;

    public C1352f(int i2) {
        this.f11343h = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1352f) && this.f11343h == ((C1352f) obj).f11343h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11343h);
    }

    public final String toString() {
        return B1.t.j(new StringBuilder("DefaultLazyKey(index="), this.f11343h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f11343h);
    }
}
