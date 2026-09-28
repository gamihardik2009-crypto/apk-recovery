package o1;

import java.util.Iterator;
import java.util.List;
import n1.C;
import n1.C0938A;
import n1.C0945f;
import n1.D;
import n2.AbstractC0961m;
import n2.AbstractC0963o;

@C("dialog")
/* loaded from: classes.dex */
public final class o extends D {
    @Override // n1.D
    public final n1.s a() {
        R.a aVar = e.f9237a;
        return new n(this);
    }

    @Override // n1.D
    public final void d(List list, C0938A c0938a) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((C0945f) it.next());
        }
    }

    @Override // n1.D
    public final void e(C0945f c0945f, boolean z3) {
        b().e(c0945f, z3);
        int I3 = AbstractC0961m.I((Iterable) b().f9049f.f4811h.getValue(), c0945f);
        int i2 = 0;
        for (Object obj : (Iterable) b().f9049f.f4811h.getValue()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0963o.y();
                throw null;
            }
            C0945f c0945f2 = (C0945f) obj;
            if (i2 > I3) {
                b().b(c0945f2);
            }
            i2 = i3;
        }
    }
}
