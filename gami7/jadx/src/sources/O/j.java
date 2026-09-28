package O;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import o2.C0998d;
import o2.C1000f;

/* loaded from: classes.dex */
public final class j extends AbstractCollection implements Collection, A2.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5116h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final Object f5117i;

    public j(e eVar) {
        this.f5117i = eVar;
    }

    public final int a() {
        switch (this.f5116h) {
            case 0:
                e eVar = (e) this.f5117i;
                eVar.getClass();
                return eVar.f5107m;
            default:
                return ((C1000f) this.f5117i).f9348p;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f5116h) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f5116h) {
            case 1:
                z2.h.f(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f5116h) {
            case 0:
                ((e) this.f5117i).clear();
                break;
            default:
                ((C1000f) this.f5117i).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f5116h) {
            case 0:
                return ((e) this.f5117i).containsValue(obj);
            default:
                return ((C1000f) this.f5117i).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f5116h) {
            case 1:
                return ((C1000f) this.f5117i).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5116h) {
            case 0:
                o[] oVarArr = new o[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    oVarArr[i2] = new p(2);
                }
                return new i((e) this.f5117i, oVarArr);
            default:
                C1000f c1000f = (C1000f) this.f5117i;
                c1000f.getClass();
                return new C0998d(c1000f, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f5116h) {
            case 1:
                C1000f c1000f = (C1000f) this.f5117i;
                c1000f.e();
                int j3 = c1000f.j(obj);
                if (j3 < 0) {
                    return false;
                }
                c1000f.m(j3);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f5116h) {
            case 1:
                z2.h.f(collection, "elements");
                ((C1000f) this.f5117i).e();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f5116h) {
            case 1:
                z2.h.f(collection, "elements");
                ((C1000f) this.f5117i).e();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    public j(C1000f c1000f) {
        z2.h.f(c1000f, "backing");
        this.f5117i = c1000f;
    }
}
