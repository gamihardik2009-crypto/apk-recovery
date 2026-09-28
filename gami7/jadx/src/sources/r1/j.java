package r1;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class j implements k {

    /* renamed from: c, reason: collision with root package name */
    public IBinder f9947c;

    @Override // r1.k
    public final void a(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(k.f9948a);
            obtain.writeStringArray(strArr);
            this.f9947c.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9947c;
    }
}
