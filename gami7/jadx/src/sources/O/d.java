package O;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d implements Iterator, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public final o[] f5099h;

    /* renamed from: i, reason: collision with root package name */
    public int f5100i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5101j = true;

    public d(n nVar, o[] oVarArr) {
        this.f5099h = oVarArr;
        oVarArr[0].a(nVar.f5126d, Integer.bitCount(nVar.f5123a) * 2, 0);
        this.f5100i = 0;
        a();
    }

    public final void a() {
        int i2 = this.f5100i;
        o[] oVarArr = this.f5099h;
        o oVar = oVarArr[i2];
        if (oVar.f5129j < oVar.f5128i) {
            return;
        }
        while (-1 < i2) {
            int b3 = b(i2);
            if (b3 == -1) {
                o oVar2 = oVarArr[i2];
                int i3 = oVar2.f5129j;
                Object[] objArr = oVar2.f5127h;
                if (i3 < objArr.length) {
                    int length = objArr.length;
                    oVar2.f5129j = i3 + 1;
                    b3 = b(i2);
                }
            }
            if (b3 != -1) {
                this.f5100i = b3;
                return;
            }
            if (i2 > 0) {
                o oVar3 = oVarArr[i2 - 1];
                int i4 = oVar3.f5129j;
                int length2 = oVar3.f5127h.length;
                oVar3.f5129j = i4 + 1;
            }
            oVarArr[i2].a(n.f5122e.f5126d, 0, 0);
            i2--;
        }
        this.f5101j = false;
    }

    public final int b(int i2) {
        o[] oVarArr = this.f5099h;
        o oVar = oVarArr[i2];
        int i3 = oVar.f5129j;
        if (i3 < oVar.f5128i) {
            return i2;
        }
        Object[] objArr = oVar.f5127h;
        if (i3 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i3];
        z2.h.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        n nVar = (n) obj;
        if (i2 == 6) {
            o oVar2 = oVarArr[i2 + 1];
            Object[] objArr2 = nVar.f5126d;
            oVar2.a(objArr2, objArr2.length, 0);
        } else {
            oVarArr[i2 + 1].a(nVar.f5126d, Integer.bitCount(nVar.f5123a) * 2, 0);
        }
        return b(i2 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5101j;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f5101j) {
            throw new NoSuchElementException();
        }
        Object next = this.f5099h[this.f5100i].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
