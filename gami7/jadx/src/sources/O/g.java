package O;

import java.util.Iterator;
import java.util.Map;
import n2.AbstractC0955g;

/* loaded from: classes.dex */
public final class g extends AbstractC0955g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5112h;

    /* renamed from: i, reason: collision with root package name */
    public final e f5113i;

    public /* synthetic */ g(int i2, e eVar) {
        this.f5112h = i2;
        this.f5113i = eVar;
    }

    @Override // n2.AbstractC0955g
    public final int a() {
        switch (this.f5112h) {
            case 0:
                e eVar = this.f5113i;
                eVar.getClass();
                return eVar.f5107m;
            default:
                e eVar2 = this.f5113i;
                eVar2.getClass();
                return eVar2.f5107m;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f5112h) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f5112h) {
            case 0:
                this.f5113i.clear();
                break;
            default:
                this.f5113i.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f5112h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!((entry instanceof Object ? entry : null) instanceof Map.Entry)) {
                    return false;
                }
                Object key = entry.getKey();
                e eVar = this.f5113i;
                Object obj2 = eVar.get(key);
                return obj2 != null ? z2.h.a(obj2, entry.getValue()) : entry.getValue() == null && eVar.containsKey(entry.getKey());
            default:
                return this.f5113i.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f5112h) {
            case 0:
                return new h(this.f5113i);
            default:
                o[] oVarArr = new o[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    oVarArr[i2] = new p(1);
                }
                return new i(this.f5113i, oVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f5112h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry instanceof Object ? entry : null) instanceof Map.Entry) {
                    return this.f5113i.remove(entry.getKey(), entry.getValue());
                }
                return false;
            default:
                e eVar = this.f5113i;
                if (!eVar.containsKey(obj)) {
                    return false;
                }
                eVar.remove(obj);
                return true;
        }
    }
}
