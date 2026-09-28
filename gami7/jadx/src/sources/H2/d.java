package H2;

import B1.C;
import G2.n;
import K1.m;
import O.o;
import O.p;
import java.util.Iterator;
import java.util.regex.Matcher;
import m2.AbstractC0872n;

/* loaded from: classes.dex */
public final class d extends AbstractC0872n {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3439i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f3440j;

    public /* synthetic */ d(int i2, Object obj) {
        this.f3439i = i2;
        this.f3440j = obj;
    }

    @Override // m2.AbstractC0872n
    public final int a() {
        switch (this.f3439i) {
            case 0:
                return ((Matcher) ((m) this.f3440j).f4558a).groupCount() + 1;
            default:
                O.c cVar = (O.c) this.f3440j;
                cVar.getClass();
                return cVar.f5098i;
        }
    }

    public c b(int i2) {
        m mVar = (m) this.f3440j;
        Matcher matcher = (Matcher) mVar.f4558a;
        E2.d m02 = C.m0(matcher.start(i2), matcher.end(i2));
        if (m02.f1076h < 0) {
            return null;
        }
        String group = ((Matcher) mVar.f4558a).group(i2);
        z2.h.e(group, "group(...)");
        return new c(group, m02);
    }

    @Override // m2.AbstractC0872n, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f3439i) {
            case 0:
                if (obj == null || (obj instanceof c)) {
                    return super.contains((c) obj);
                }
                return false;
            default:
                return ((O.c) this.f3440j).containsValue(obj);
        }
    }

    @Override // m2.AbstractC0872n, java.util.Collection
    public boolean isEmpty() {
        switch (this.f3439i) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3439i) {
            case 0:
                return new n(new G2.d(new G2.k(1, new E2.d(0, a() - 1, 1)), new A0.n(7, this), 2));
            default:
                O.n nVar = ((O.c) this.f3440j).f5097h;
                o[] oVarArr = new o[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    oVarArr[i2] = new p(2);
                }
                return new O.l(nVar, oVarArr);
        }
    }
}
