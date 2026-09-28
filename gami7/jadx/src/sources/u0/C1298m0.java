package u0;

import android.os.Parcel;

/* renamed from: u0.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1298m0 {

    /* renamed from: a, reason: collision with root package name */
    public Parcel f11113a;

    public long a() {
        Parcel parcel = this.f11113a;
        byte readByte = parcel.readByte();
        long j3 = readByte == 1 ? 4294967296L : readByte == 2 ? 8589934592L : 0L;
        if (!O0.n.a(j3, 0L)) {
            return B1.C.f0(parcel.readFloat(), j3);
        }
        O0.n[] nVarArr = O0.m.f5152b;
        return O0.m.f5153c;
    }

    public void b(byte b3) {
        this.f11113a.writeByte(b3);
    }

    public void c(float f3) {
        this.f11113a.writeFloat(f3);
    }

    public void d(long j3) {
        long b3 = O0.m.b(j3);
        byte b4 = 0;
        if (!O0.n.a(b3, 0L)) {
            if (O0.n.a(b3, 4294967296L)) {
                b4 = 1;
            } else if (O0.n.a(b3, 8589934592L)) {
                b4 = 2;
            }
        }
        b(b4);
        if (O0.n.a(O0.m.b(j3), 0L)) {
            return;
        }
        c(O0.m.c(j3));
    }
}
