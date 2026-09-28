package r1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class o extends Binder implements l {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f9968c;

    public o(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f9968c = multiInstanceInvalidationService;
        attachInterface(this, l.f9949b);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public final void b(int i2, String[] strArr) {
        z2.h.f(strArr, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f9968c;
        synchronized (multiInstanceInvalidationService.f6929j) {
            String str = (String) multiInstanceInvalidationService.f6928i.get(Integer.valueOf(i2));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.f6929j.beginBroadcast();
            for (int i3 = 0; i3 < beginBroadcast; i3++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.f6929j.getBroadcastCookie(i3);
                    z2.h.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) broadcastCookie;
                    int intValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.f6928i.get(num);
                    if (i2 != intValue && z2.h.a(str, str2)) {
                        try {
                            ((k) multiInstanceInvalidationService.f6929j.getBroadcastItem(i3)).a(strArr);
                        } catch (RemoteException e3) {
                            Log.w("ROOM", "Error invoking a remote callback", e3);
                        }
                    }
                } finally {
                    multiInstanceInvalidationService.f6929j.finishBroadcast();
                }
            }
        }
    }

    public final int c(k kVar, String str) {
        z2.h.f(kVar, "callback");
        int i2 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f9968c;
        synchronized (multiInstanceInvalidationService.f6929j) {
            try {
                int i3 = multiInstanceInvalidationService.f6927h + 1;
                multiInstanceInvalidationService.f6927h = i3;
                if (multiInstanceInvalidationService.f6929j.register(kVar, Integer.valueOf(i3))) {
                    multiInstanceInvalidationService.f6928i.put(Integer.valueOf(i3), str);
                    i2 = i3;
                } else {
                    multiInstanceInvalidationService.f6927h--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        String str = l.f9949b;
        if (i2 >= 1 && i2 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i2 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        k kVar = null;
        k kVar2 = null;
        if (i2 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(k.f9948a);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof k)) {
                    j jVar = new j();
                    jVar.f9947c = readStrongBinder;
                    kVar = jVar;
                } else {
                    kVar = (k) queryLocalInterface;
                }
            }
            int c3 = c(kVar, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(c3);
        } else if (i2 == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(k.f9948a);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof k)) {
                    j jVar2 = new j();
                    jVar2.f9947c = readStrongBinder2;
                    kVar2 = jVar2;
                } else {
                    kVar2 = (k) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            z2.h.f(kVar2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f9968c;
            synchronized (multiInstanceInvalidationService.f6929j) {
                multiInstanceInvalidationService.f6929j.unregister(kVar2);
            }
            parcel2.writeNoException();
        } else {
            if (i2 != 3) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            b(parcel.readInt(), parcel.createStringArray());
        }
        return true;
    }
}
