package androidx.versionedparcelable;

import A1.a;
import A1.c;
import A1.d;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(0);

    /* renamed from: h, reason: collision with root package name */
    public final d f6931h;

    public ParcelImpl(Parcel parcel) {
        this.f6931h = new c(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        new c(parcel).i(this.f6931h);
    }
}
