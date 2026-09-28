package G2;

import a.AbstractC0423a;
import j.C0736B;
import j.C0770z;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import n2.AbstractC0963o;

/* loaded from: classes.dex */
public final class e implements Iterator, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1257h;

    /* renamed from: i, reason: collision with root package name */
    public int f1258i;

    /* renamed from: j, reason: collision with root package name */
    public Object f1259j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f1260k;

    public e(Object obj, O.c cVar) {
        this.f1257h = 2;
        this.f1259j = obj;
        this.f1260k = cVar;
    }

    public void a() {
        Object l3;
        int i2 = this.f1258i;
        f fVar = (f) this.f1260k;
        if (i2 == -2) {
            l3 = ((y2.a) fVar.f1262b).c();
        } else {
            y2.c cVar = (y2.c) fVar.f1263c;
            Object obj = this.f1259j;
            z2.h.c(obj);
            l3 = cVar.l(obj);
        }
        this.f1259j = l3;
        this.f1258i = l3 == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1257h) {
            case 0:
                if (this.f1258i < 0) {
                    a();
                }
                return this.f1258i == 1;
            case 1:
                return ((Iterator) this.f1259j).hasNext();
            case 2:
                return this.f1258i < ((Map) this.f1260k).size();
            default:
                return ((h) this.f1259j).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1257h) {
            case 0:
                if (this.f1258i < 0) {
                    a();
                }
                if (this.f1258i == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f1259j;
                z2.h.d(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f1258i = -1;
                return obj;
            case 1:
                y2.e eVar = (y2.e) ((f) this.f1260k).f1263c;
                int i2 = this.f1258i;
                this.f1258i = i2 + 1;
                if (i2 >= 0) {
                    return eVar.j(Integer.valueOf(i2), ((Iterator) this.f1259j).next());
                }
                AbstractC0963o.y();
                throw null;
            case 2:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f1259j;
                this.f1258i++;
                Object obj3 = ((Map) this.f1260k).get(obj2);
                if (obj3 != null) {
                    this.f1259j = ((P.a) obj3).f5220b;
                    return obj2;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
            default:
                return ((h) this.f1259j).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1257h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                int i2 = this.f1258i;
                if (i2 != -1) {
                    ((C0736B) this.f1260k).k(i2);
                    this.f1258i = -1;
                    return;
                }
                return;
        }
    }

    public e(f fVar, byte b3) {
        this.f1257h = 1;
        this.f1260k = fVar;
        this.f1259j = ((g) fVar.f1262b).iterator();
    }

    public e(f fVar) {
        this.f1257h = 0;
        this.f1260k = fVar;
        this.f1258i = -2;
    }

    public e(C0736B c0736b) {
        this.f1257h = 3;
        this.f1260k = c0736b;
        this.f1258i = -1;
        this.f1259j = AbstractC0423a.Q(new C0770z(c0736b, this, null));
    }
}
