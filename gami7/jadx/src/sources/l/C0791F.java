package l;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: l.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0791F {

    /* renamed from: b, reason: collision with root package name */
    public static final C0791F f8129b = new C0791F(new V(null, null, null, null, false, null, 63));

    /* renamed from: c, reason: collision with root package name */
    public static final C0791F f8130c = new C0791F(new V(null, null, null, null, true, null, 47));

    /* renamed from: a, reason: collision with root package name */
    public final V f8131a;

    public C0791F(V v3) {
        this.f8131a = v3;
    }

    public final C0791F a(C0791F c0791f) {
        V v3 = c0791f.f8131a;
        G g3 = v3.f8167a;
        V v4 = this.f8131a;
        if (g3 == null) {
            g3 = v4.f8167a;
        }
        G g4 = g3;
        T t3 = v3.f8168b;
        if (t3 == null) {
            t3 = v4.f8168b;
        }
        T t4 = t3;
        C0810t c0810t = v3.f8169c;
        if (c0810t == null) {
            c0810t = v4.f8169c;
        }
        C0810t c0810t2 = c0810t;
        L l3 = v3.f8170d;
        if (l3 == null) {
            l3 = v4.f8170d;
        }
        L l4 = l3;
        boolean z3 = v3.f8171e || v4.f8171e;
        Map map = v4.f8172f;
        z2.h.f(map, "<this>");
        Map map2 = v3.f8172f;
        z2.h.f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new C0791F(new V(g4, t4, c0810t2, l4, z3, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0791F) && z2.h.a(((C0791F) obj).f8131a, this.f8131a);
    }

    public final int hashCode() {
        return this.f8131a.hashCode();
    }

    public final String toString() {
        if (z2.h.a(this, f8129b)) {
            return "ExitTransition.None";
        }
        if (z2.h.a(this, f8130c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        V v3 = this.f8131a;
        G g3 = v3.f8167a;
        sb.append(g3 != null ? g3.toString() : null);
        sb.append(",\nSlide - ");
        T t3 = v3.f8168b;
        sb.append(t3 != null ? t3.toString() : null);
        sb.append(",\nShrink - ");
        C0810t c0810t = v3.f8169c;
        sb.append(c0810t != null ? c0810t.toString() : null);
        sb.append(",\nScale - ");
        L l3 = v3.f8170d;
        sb.append(l3 != null ? l3.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(v3.f8171e);
        return sb.toString();
    }
}
