package H;

import e0.InterfaceC0654d;
import m2.C0880v;

/* renamed from: H.z3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234z3 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ P3 f3377i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f3378j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f3379k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f3380l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f3381m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0234z3(P3 p3, long j3, long j4, long j5, long j6) {
        super(1);
        this.f3377i = p3;
        this.f3378j = j3;
        this.f3379k = j4;
        this.f3380l = j5;
        this.f3381m = j6;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        InterfaceC0654d interfaceC0654d = (InterfaceC0654d) obj;
        P3 p3 = this.f3377i;
        float[] fArr = p3.f1904f;
        float c3 = p3.c();
        int i2 = 0;
        boolean z3 = interfaceC0654d.getLayoutDirection() == O0.k.f5149i;
        long e3 = K1.f.e(0.0f, b0.c.e(interfaceC0654d.x()));
        long e4 = K1.f.e(b0.f.d(interfaceC0654d.e()), b0.c.e(interfaceC0654d.x()));
        long j3 = z3 ? e4 : e3;
        if (z3) {
            e4 = e3;
        }
        float P2 = interfaceC0654d.P(M3.f1748d);
        float P3 = interfaceC0654d.P(M3.f1749e);
        long j4 = e4;
        long j5 = j3;
        interfaceC0654d.v(this.f3378j, j3, j4, P3, (r22 & 16) != 0 ? 0 : 1, 1.0f, null, 3);
        interfaceC0654d.v(this.f3379k, K1.f.e(((b0.c.d(j4) - b0.c.d(j5)) * 0.0f) + b0.c.d(j5), b0.c.e(interfaceC0654d.x())), K1.f.e(((b0.c.d(j4) - b0.c.d(j5)) * c3) + b0.c.d(j5), b0.c.e(interfaceC0654d.x())), P3, (r22 & 16) != 0 ? 0 : 1, 1.0f, null, 3);
        int length = fArr.length;
        while (i2 < length) {
            float f3 = fArr[i2];
            long j6 = j4;
            long j7 = j5;
            j4 = j6;
            interfaceC0654d.k0((f3 > c3 || f3 < 0.0f) ? this.f3380l : this.f3381m, P2 / 2.0f, (r19 & 4) != 0 ? interfaceC0654d.x() : K1.f.e(b0.c.d(K1.f.H(j7, j6, f3)), b0.c.e(interfaceC0654d.x())), 1.0f, (r19 & 16) != 0 ? e0.g.f7556a : null, null, 3);
            i2++;
            j5 = j7;
        }
        return C0880v.f8657a;
    }
}
