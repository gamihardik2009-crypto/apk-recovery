package P1;

import J.C0300y;
import m2.C0880v;
import n1.C0939B;
import n1.v;
import n1.y;
import n2.AbstractC0946A;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements y2.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5242h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y f5243i;

    public /* synthetic */ g(y yVar, int i2) {
        this.f5242h = i2;
        this.f5243i = yVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        C0880v c0880v = C0880v.f8657a;
        y yVar = this.f5243i;
        C0939B c0939b = (C0939B) obj;
        switch (this.f5242h) {
            case 0:
                z2.h.f(yVar, "$navController");
                z2.h.f(c0939b, "$this$navigate");
                int i2 = v.f9104u;
                c0939b.f9010d = AbstractC0946A.j(yVar.g()).f9093n;
                C0300y c0300y = new C0300y();
                c0300y.f4287a = true;
                c0939b.f9011e = c0300y.f4287a;
                c0939b.f9008b = true;
                c0939b.f9009c = true;
                break;
            default:
                z2.h.f(yVar, "$navController");
                z2.h.f(c0939b, "$this$navigate");
                int i3 = v.f9104u;
                c0939b.f9010d = AbstractC0946A.j(yVar.g()).f9093n;
                C0300y c0300y2 = new C0300y();
                c0300y2.f4287a = true;
                c0939b.f9011e = c0300y2.f4287a;
                c0939b.f9008b = true;
                c0939b.f9009c = true;
                break;
        }
        return c0880v;
    }
}
