package J;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: J.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264f0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4133a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f4133a) {
            case 0:
                return new C0266g0(parcel.readFloat());
            case 1:
                return new C0268h0(parcel.readInt());
            default:
                return new C0270i0(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f4133a) {
            case 0:
                return new C0266g0[i2];
            case 1:
                return new C0268h0[i2];
            default:
                return new C0270i0[i2];
        }
    }
}
