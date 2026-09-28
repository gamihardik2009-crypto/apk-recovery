package M2;

import H.C4;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import c0.AbstractC0571K;
import c0.C0588g;
import c0.C0594m;
import c0.C0596o;
import m2.C0880v;
import z.EnumC1406F;

/* renamed from: M2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0346j extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4890i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f4891j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0346j(long j3, int i2) {
        super(1);
        this.f4890i = i2;
        this.f4891j = j3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f4890i) {
            case 0:
                return Long.valueOf(this.f4891j);
            case 1:
                Z.c cVar = (Z.c) obj;
                float d3 = b0.f.d(cVar.f6379h.e()) / 2.0f;
                C0588g q = K1.f.q(cVar, d3);
                int i2 = Build.VERSION.SDK_INT;
                long j3 = this.f4891j;
                return cVar.a(new C4(d3, q, new C0594m(j3, 5, i2 >= 29 ? C0596o.f7267a.a(j3, 5) : new PorterDuffColorFilter(AbstractC0571K.A(j3), AbstractC0571K.D(5))), 3));
            default:
                ((A0.k) obj).e(D.E.f725c, new D.D(EnumC1406F.f11507h, this.f4891j, 2, true));
                return C0880v.f8657a;
        }
    }
}
