package e;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import z2.h;

/* loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new A1.a(2);

    /* renamed from: h, reason: collision with root package name */
    public final IntentSender f7543h;

    /* renamed from: i, reason: collision with root package name */
    public final Intent f7544i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7545j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7546k;

    public f(Parcel parcel) {
        h.f(parcel, "parcel");
        Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        h.c(readParcelable);
        Intent intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        this.f7543h = (IntentSender) readParcelable;
        this.f7544i = intent;
        this.f7545j = readInt;
        this.f7546k = readInt2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.f(parcel, "dest");
        parcel.writeParcelable(this.f7543h, i2);
        parcel.writeParcelable(this.f7544i, i2);
        parcel.writeInt(this.f7545j);
        parcel.writeInt(this.f7546k);
    }
}
