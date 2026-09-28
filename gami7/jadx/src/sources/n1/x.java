package n1;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import n2.AbstractC0962n;

@C("navigation")
/* loaded from: classes.dex */
public class x extends D {

    /* renamed from: c, reason: collision with root package name */
    public final F f9111c;

    public x(F f3) {
        z2.h.f(f3, "navigatorProvider");
        this.f9111c = f3;
    }

    @Override // n1.D
    public final void d(List list, C0938A c0938a) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0945f c0945f = (C0945f) it.next();
            s sVar = c0945f.f9028i;
            z2.h.d(sVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            v vVar = (v) sVar;
            Bundle g3 = c0945f.g();
            int i2 = vVar.f9105r;
            String str = vVar.f9107t;
            if (i2 == 0 && str == null) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i3 = vVar.f9093n;
                sb.append(i3 != 0 ? String.valueOf(i3) : "the root navigation");
                throw new IllegalStateException(sb.toString().toString());
            }
            s g4 = str != null ? vVar.g(str, false) : (s) vVar.q.c(i2);
            if (g4 == null) {
                if (vVar.f9106s == null) {
                    String str2 = vVar.f9107t;
                    if (str2 == null) {
                        str2 = String.valueOf(vVar.f9105r);
                    }
                    vVar.f9106s = str2;
                }
                String str3 = vVar.f9106s;
                z2.h.c(str3);
                throw new IllegalArgumentException("navigation destination " + str3 + " is not a direct child of this NavGraph");
            }
            if (str != null && !z2.h.a(str, g4.f9094o)) {
                r f3 = g4.f(str);
                Bundle bundle = f3 != null ? f3.f9082i : null;
                if (bundle != null && !bundle.isEmpty()) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putAll(bundle);
                    if (g3 != null) {
                        bundle2.putAll(g3);
                    }
                    g3 = bundle2;
                }
            }
            D b3 = this.f9111c.b(g4.f9087h);
            i b4 = b();
            Bundle b5 = g4.b(g3);
            y yVar = b4.f9051h;
            b3.d(AbstractC0962n.l(C1.b.b(yVar.f9116a, g4, b5, yVar.h(), yVar.f9131p)), c0938a);
        }
    }

    @Override // n1.D
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public v a() {
        return new v(this);
    }
}
