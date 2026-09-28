package v;

import H.C0148m;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final S.c f11396a;

    /* renamed from: b, reason: collision with root package name */
    public final y2.a f11397b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f11398c = new LinkedHashMap();

    public w(S.c cVar, D.G g3) {
        this.f11396a = cVar;
        this.f11397b = g3;
    }

    public final y2.e a(Object obj, int i2, Object obj2) {
        R.a aVar;
        LinkedHashMap linkedHashMap = this.f11398c;
        C1368v c1368v = (C1368v) linkedHashMap.get(obj);
        if (c1368v != null && c1368v.f11393c == i2 && z2.h.a(c1368v.f11392b, obj2)) {
            y2.e eVar = c1368v.f11394d;
            if (eVar != null) {
                return eVar;
            }
            aVar = new R.a(1403994769, new C0148m(c1368v.f11395e, 18, c1368v), true);
            c1368v.f11394d = aVar;
        } else {
            C1368v c1368v2 = new C1368v(this, i2, obj, obj2);
            linkedHashMap.put(obj, c1368v2);
            y2.e eVar2 = c1368v2.f11394d;
            if (eVar2 != null) {
                return eVar2;
            }
            aVar = new R.a(1403994769, new C0148m(this, 18, c1368v2), true);
            c1368v2.f11394d = aVar;
        }
        return aVar;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        C1368v c1368v = (C1368v) this.f11398c.get(obj);
        if (c1368v != null) {
            return c1368v.f11392b;
        }
        x xVar = (x) this.f11397b.c();
        int c3 = xVar.c(obj);
        if (c3 != -1) {
            return xVar.d(c3);
        }
        return null;
    }
}
