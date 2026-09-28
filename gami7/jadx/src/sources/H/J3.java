package H;

import J.C0266g0;
import m2.C0880v;

/* loaded from: classes.dex */
public final class J3 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1641i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P3 f1642j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J3(P3 p3, int i2) {
        super(1);
        this.f1641i = i2;
        this.f1642j = p3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        int i2;
        switch (this.f1641i) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                P3 p3 = this.f1642j;
                E2.a aVar = p3.f1901c;
                float B3 = B1.C.B(floatValue, aVar.f1074a, aVar.f1075b);
                boolean z3 = true;
                int i3 = p3.f1899a;
                if (i3 > 0 && (i2 = i3 + 1) >= 0) {
                    float f3 = B3;
                    float f4 = f3;
                    int i4 = 0;
                    while (true) {
                        float y3 = B2.a.y(aVar.f1074a, aVar.f1075b, i4 / i2);
                        float f5 = y3 - B3;
                        if (Math.abs(f5) <= f3) {
                            f3 = Math.abs(f5);
                            f4 = y3;
                        }
                        if (i4 != i2) {
                            i4++;
                        } else {
                            B3 = f4;
                        }
                    }
                }
                C0266g0 c0266g0 = p3.f1902d;
                if (B3 == c0266g0.g()) {
                    z3 = false;
                } else {
                    if (B3 != c0266g0.g()) {
                        y2.c cVar = p3.f1903e;
                        if (cVar != null) {
                            cVar.l(Float.valueOf(B3));
                        } else {
                            p3.d(B3);
                        }
                    }
                    y2.a aVar2 = p3.f1900b;
                    if (aVar2 != null) {
                        aVar2.c();
                    }
                }
                return Boolean.valueOf(z3);
            default:
                long j3 = ((b0.c) obj).f7058a;
                P3 p32 = this.f1642j;
                p32.a(0.0f);
                p32.f1909k.c();
                return C0880v.f8657a;
        }
    }
}
