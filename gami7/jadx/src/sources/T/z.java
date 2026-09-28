package T;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class z implements Iterator, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public final u f5764h;

    /* renamed from: i, reason: collision with root package name */
    public final Iterator f5765i;

    /* renamed from: j, reason: collision with root package name */
    public int f5766j;

    /* renamed from: k, reason: collision with root package name */
    public Map.Entry f5767k;

    /* renamed from: l, reason: collision with root package name */
    public Map.Entry f5768l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5769m;

    public z(u uVar, Iterator it, int i2) {
        this.f5769m = i2;
        this.f5764h = uVar;
        this.f5765i = it;
        this.f5766j = uVar.f().f5729d;
        a();
    }

    public final void a() {
        this.f5767k = this.f5768l;
        Iterator it = this.f5765i;
        this.f5768l = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5768l != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5769m) {
            case 0:
                a();
                if (this.f5767k != null) {
                    return new y(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.f5768l;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.f5768l;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry2.getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        u uVar = this.f5764h;
        if (uVar.f().f5729d != this.f5766j) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f5767k;
        if (entry == null) {
            throw new IllegalStateException();
        }
        uVar.remove(entry.getKey());
        this.f5767k = null;
        this.f5766j = uVar.f().f5729d;
    }
}
