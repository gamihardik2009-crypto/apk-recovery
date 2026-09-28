package G0;

import java.util.HashMap;
import java.util.LinkedHashSet;
import n2.AbstractC0961m;
import z2.h;
import z2.v;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final C1.b f1220a = new C1.b(6, false);

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1221b = new HashMap(0, 0.75f);

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f1222c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public int f1223d;

    /* renamed from: e, reason: collision with root package name */
    public int f1224e;

    /* renamed from: f, reason: collision with root package name */
    public int f1225f;

    public final Object a(Object obj) {
        synchronized (this.f1220a) {
            Object obj2 = this.f1221b.get(obj);
            if (obj2 == null) {
                this.f1225f++;
                return null;
            }
            this.f1222c.remove(obj);
            this.f1222c.add(obj);
            this.f1224e++;
            return obj2;
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object put;
        Object obj3;
        Object obj4;
        if (obj == null) {
            throw null;
        }
        if (obj2 == null) {
            throw null;
        }
        synchronized (this.f1220a) {
            try {
                this.f1223d = d() + 1;
                put = this.f1221b.put(obj, obj2);
                if (put != null) {
                    this.f1223d = d() - 1;
                }
                if (this.f1222c.contains(obj)) {
                    this.f1222c.remove(obj);
                }
                this.f1222c.add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        while (true) {
            synchronized (this.f1220a) {
                try {
                    if (d() >= 0) {
                        if (this.f1221b.isEmpty() && d() != 0) {
                            break;
                        }
                        if (this.f1221b.isEmpty() != this.f1222c.isEmpty()) {
                            break;
                        }
                        if (d() <= 16 || this.f1221b.isEmpty()) {
                            obj3 = null;
                            obj4 = null;
                        } else {
                            obj3 = AbstractC0961m.F(this.f1222c);
                            obj4 = this.f1221b.get(obj3);
                            if (obj4 == null) {
                                throw new IllegalStateException("inconsistent state");
                            }
                            HashMap hashMap = this.f1221b;
                            v.c(hashMap);
                            hashMap.remove(obj3);
                            LinkedHashSet linkedHashSet = this.f1222c;
                            v.a(linkedHashSet);
                            linkedHashSet.remove(obj3);
                            int d3 = d();
                            h.c(obj3);
                            this.f1223d = d3 - 1;
                        }
                    } else {
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (obj3 == null && obj4 == null) {
                return put;
            }
            h.c(obj3);
            h.c(obj4);
        }
        throw new IllegalStateException("map/keySet size inconsistency");
    }

    public final Object c(Object obj) {
        Object remove;
        obj.getClass();
        synchronized (this.f1220a) {
            remove = this.f1221b.remove(obj);
            this.f1222c.remove(obj);
            if (remove != null) {
                this.f1223d = d() - 1;
            }
        }
        return remove;
    }

    public final int d() {
        int i2;
        synchronized (this.f1220a) {
            i2 = this.f1223d;
        }
        return i2;
    }

    public final String toString() {
        String str;
        synchronized (this.f1220a) {
            try {
                int i2 = this.f1224e;
                int i3 = this.f1225f + i2;
                str = "LruCache[maxSize=16,hits=" + this.f1224e + ",misses=" + this.f1225f + ",hitRate=" + (i3 != 0 ? (i2 * 100) / i3 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
