package H;

import T.AbstractC0379g;
import a0.AbstractC0427d;
import a0.C0442s;
import java.util.Collection;
import m2.C0880v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import t.C1206a;
import t.C1228w;
import v.AbstractC1338J;
import v.C1335G;
import v.C1337I;

/* loaded from: classes.dex */
public final class U2 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2041i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2042j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2043k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U2(int i2, int i3, Object obj) {
        super(1);
        this.f2041i = i3;
        this.f2043k = obj;
        this.f2042j = i2;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f2041i) {
            case 0:
                AbstractC1102P.d((AbstractC1102P) obj, (AbstractC1103Q) this.f2043k, 0, -this.f2042j);
                break;
            case 1:
                break;
            case 2:
                Boolean C3 = AbstractC0427d.C((C0442s) obj, this.f2042j);
                ((z2.s) this.f2043k).f11909h = C3;
                break;
            case 3:
                C1335G c1335g = (C1335G) obj;
                C1206a c1206a = ((C1228w) this.f2043k).f10343a;
                AbstractC0379g c3 = T.s.c();
                T.s.f(c3, T.s.d(c3), c3 != null ? c3.f() : null);
                for (int i2 = 0; i2 < c1206a.f10214a; i2++) {
                    int i3 = this.f2042j + i2;
                    c1335g.getClass();
                    long j3 = AbstractC1338J.f11291a;
                    C1337I c1337i = c1335g.f11287b;
                    Q1.r rVar = c1337i.f11290c;
                    if (rVar != null) {
                        c1335g.f11286a.add(new v.T(rVar, i3, j3, c1337i.f11289b));
                    }
                }
                break;
            default:
                C1335G c1335g2 = (C1335G) obj;
                C1206a c1206a2 = ((u.x) this.f2043k).f10795a;
                AbstractC0379g c4 = T.s.c();
                T.s.f(c4, T.s.d(c4), c4 != null ? c4.f() : null);
                for (int i4 = 0; i4 < c1206a2.f10214a; i4++) {
                    int i5 = this.f2042j + i4;
                    c1335g2.getClass();
                    long j4 = AbstractC1338J.f11291a;
                    C1337I c1337i2 = c1335g2.f11287b;
                    Q1.r rVar2 = c1337i2.f11290c;
                    if (rVar2 != null) {
                        c1335g2.f11286a.add(new v.T(rVar2, i5, j4, c1337i2.f11289b));
                    }
                }
                break;
        }
        return C0880v.f8657a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2(int i2, Collection collection) {
        super(1);
        this.f2041i = 1;
        this.f2042j = i2;
        this.f2043k = collection;
    }
}
