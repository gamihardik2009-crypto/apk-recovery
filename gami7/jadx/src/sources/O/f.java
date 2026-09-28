package O;

import a.AbstractC0423a;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import z2.v;

/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: k, reason: collision with root package name */
    public final e f5108k;

    /* renamed from: l, reason: collision with root package name */
    public Object f5109l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5110m;

    /* renamed from: n, reason: collision with root package name */
    public int f5111n;

    public f(e eVar, o[] oVarArr) {
        super(eVar.f5104j, oVarArr);
        this.f5108k = eVar;
        this.f5111n = eVar.f5106l;
    }

    public final void e(int i2, n nVar, Object obj, int i3) {
        int i4 = i3 * 5;
        o[] oVarArr = this.f5099h;
        if (i4 <= 30) {
            int O3 = 1 << AbstractC0423a.O(i2, i4);
            if (nVar.h(O3)) {
                oVarArr[i3].a(nVar.f5126d, Integer.bitCount(nVar.f5123a) * 2, nVar.f(O3));
                this.f5100i = i3;
                return;
            } else {
                int t3 = nVar.t(O3);
                n s3 = nVar.s(t3);
                oVarArr[i3].a(nVar.f5126d, Integer.bitCount(nVar.f5123a) * 2, t3);
                e(i2, s3, obj, i3 + 1);
                return;
            }
        }
        o oVar = oVarArr[i3];
        Object[] objArr = nVar.f5126d;
        oVar.a(objArr, objArr.length, 0);
        while (true) {
            o oVar2 = oVarArr[i3];
            if (z2.h.a(oVar2.f5127h[oVar2.f5129j], obj)) {
                this.f5100i = i3;
                return;
            } else {
                oVarArr[i3].f5129j += 2;
            }
        }
    }

    @Override // O.d, java.util.Iterator
    public final Object next() {
        if (this.f5108k.f5106l != this.f5111n) {
            throw new ConcurrentModificationException();
        }
        if (!this.f5101j) {
            throw new NoSuchElementException();
        }
        o oVar = this.f5099h[this.f5100i];
        this.f5109l = oVar.f5127h[oVar.f5129j];
        this.f5110m = true;
        return super.next();
    }

    @Override // O.d, java.util.Iterator
    public final void remove() {
        if (!this.f5110m) {
            throw new IllegalStateException();
        }
        boolean z3 = this.f5101j;
        e eVar = this.f5108k;
        if (!z3) {
            Object obj = this.f5109l;
            v.c(eVar);
            eVar.remove(obj);
        } else {
            if (!z3) {
                throw new NoSuchElementException();
            }
            o oVar = this.f5099h[this.f5100i];
            Object obj2 = oVar.f5127h[oVar.f5129j];
            Object obj3 = this.f5109l;
            v.c(eVar);
            eVar.remove(obj3);
            e(obj2 != null ? obj2.hashCode() : 0, eVar.f5104j, obj2, 0);
        }
        this.f5109l = null;
        this.f5110m = false;
        this.f5111n = eVar.f5106l;
    }
}
