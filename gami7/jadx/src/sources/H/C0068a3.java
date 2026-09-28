package H;

import J.C0285q;
import java.util.ArrayList;
import java.util.List;
import m2.C0880v;
import s.C1151D;
import s.C1160M;

/* renamed from: H.a3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0068a3 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2289i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s.Y f2290j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r0.a0 f2291k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f2292l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2293m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List f2294n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Integer f2295o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.f f2296p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0068a3(s.Y y3, r0.a0 a0Var, ArrayList arrayList, int i2, ArrayList arrayList2, Integer num, y2.f fVar, int i3) {
        super(2);
        this.f2289i = i3;
        this.f2290j = y3;
        this.f2291k = a0Var;
        this.f2292l = arrayList;
        this.f2293m = i2;
        this.f2294n = arrayList2;
        this.f2295o = num;
        this.f2296p = fVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        Integer num;
        Integer num2;
        switch (this.f2289i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    s.Y y3 = this.f2290j;
                    r0.a0 a0Var = this.f2291k;
                    C1151D c1151d = new C1151D(y3, a0Var);
                    this.f2296p.i(new C1160M(androidx.compose.foundation.layout.a.e(c1151d, a0Var.getLayoutDirection()), this.f2292l.isEmpty() ? c1151d.d() : a0Var.o0(this.f2293m), androidx.compose.foundation.layout.a.d(c1151d, a0Var.getLayoutDirection()), (this.f2294n.isEmpty() || (num = this.f2295o) == null) ? c1151d.c() : a0Var.o0(num.intValue())), c0285q, 0);
                }
                break;
            default:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    s.Y y4 = this.f2290j;
                    r0.a0 a0Var2 = this.f2291k;
                    C1151D c1151d2 = new C1151D(y4, a0Var2);
                    this.f2296p.i(new C1160M(androidx.compose.foundation.layout.a.e(c1151d2, a0Var2.getLayoutDirection()), this.f2292l.isEmpty() ? c1151d2.d() : a0Var2.o0(this.f2293m), androidx.compose.foundation.layout.a.d(c1151d2, a0Var2.getLayoutDirection()), (this.f2294n.isEmpty() || (num2 = this.f2295o) == null) ? c1151d2.c() : a0Var2.o0(num2.intValue())), c0285q2, 0);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
