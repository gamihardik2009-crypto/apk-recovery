package A1;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import e.f;
import n1.g;
import z2.h;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f127a) {
            case 0:
                return new ParcelImpl(parcel);
            case 1:
                h.f(parcel, "parcel");
                return new e.a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 2:
                h.f(parcel, "inParcel");
                return new f(parcel);
            default:
                h.f(parcel, "inParcel");
                return new g(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f127a) {
            case 0:
                return new ParcelImpl[i2];
            case 1:
                return new e.a[i2];
            case 2:
                return new f[i2];
            default:
                return new g[i2];
        }
    }
}
