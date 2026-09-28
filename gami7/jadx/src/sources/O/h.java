package O;

import i0.AbstractC0733z;
import i0.C0731x;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class h implements Iterator, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5114h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final Iterator f5115i;

    public h(e eVar) {
        o[] oVarArr = new o[8];
        for (int i2 = 0; i2 < 8; i2++) {
            oVarArr[i2] = new q(this);
        }
        this.f5115i = new f(eVar, oVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5114h) {
            case 0:
                return ((f) this.f5115i).f5101j;
            default:
                return this.f5115i.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5114h) {
            case 0:
                return (Map.Entry) ((f) this.f5115i).next();
            default:
                return (AbstractC0733z) this.f5115i.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5114h) {
            case 0:
                ((f) this.f5115i).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(C0731x c0731x) {
        this.f5115i = c0731x.q.iterator();
    }
}
