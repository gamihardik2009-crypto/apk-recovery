package N;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: j, reason: collision with root package name */
    public final g f4967j;

    /* renamed from: k, reason: collision with root package name */
    public int f4968k;

    /* renamed from: l, reason: collision with root package name */
    public k f4969l;

    /* renamed from: m, reason: collision with root package name */
    public int f4970m;

    public i(g gVar, int i2) {
        super(i2, gVar.a());
        this.f4967j = gVar;
        this.f4968k = gVar.g();
        this.f4970m = -1;
        b();
    }

    public final void a() {
        if (this.f4968k != this.f4967j.g()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // N.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i2 = this.f4946h;
        g gVar = this.f4967j;
        gVar.add(i2, obj);
        this.f4946h++;
        this.f4947i = gVar.a();
        this.f4968k = gVar.g();
        this.f4970m = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        g gVar = this.f4967j;
        Object[] objArr = gVar.f4962m;
        if (objArr == null) {
            this.f4969l = null;
            return;
        }
        int i2 = (gVar.f4964o - 1) & (-32);
        int i3 = this.f4946h;
        if (i3 > i2) {
            i3 = i2;
        }
        int i4 = (gVar.f4960k / 5) + 1;
        k kVar = this.f4969l;
        if (kVar == null) {
            this.f4969l = new k(objArr, i3, i2, i4);
            return;
        }
        kVar.f4946h = i3;
        kVar.f4947i = i2;
        kVar.f4973j = i4;
        if (kVar.f4974k.length < i4) {
            kVar.f4974k = new Object[i4];
        }
        kVar.f4974k[0] = objArr;
        ?? r6 = i3 == i2 ? 1 : 0;
        kVar.f4975l = r6;
        kVar.b(i3 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f4946h;
        this.f4970m = i2;
        k kVar = this.f4969l;
        g gVar = this.f4967j;
        if (kVar == null) {
            Object[] objArr = gVar.f4963n;
            this.f4946h = i2 + 1;
            return objArr[i2];
        }
        if (kVar.hasNext()) {
            this.f4946h++;
            return kVar.next();
        }
        Object[] objArr2 = gVar.f4963n;
        int i3 = this.f4946h;
        this.f4946h = i3 + 1;
        return objArr2[i3 - kVar.f4947i];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f4946h;
        this.f4970m = i2 - 1;
        k kVar = this.f4969l;
        g gVar = this.f4967j;
        if (kVar == null) {
            Object[] objArr = gVar.f4963n;
            int i3 = i2 - 1;
            this.f4946h = i3;
            return objArr[i3];
        }
        int i4 = kVar.f4947i;
        if (i2 <= i4) {
            this.f4946h = i2 - 1;
            return kVar.previous();
        }
        Object[] objArr2 = gVar.f4963n;
        int i5 = i2 - 1;
        this.f4946h = i5;
        return objArr2[i5 - i4];
    }

    @Override // N.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i2 = this.f4970m;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        g gVar = this.f4967j;
        gVar.b(i2);
        int i3 = this.f4970m;
        if (i3 < this.f4946h) {
            this.f4946h = i3;
        }
        this.f4947i = gVar.a();
        this.f4968k = gVar.g();
        this.f4970m = -1;
        b();
    }

    @Override // N.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i2 = this.f4970m;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        g gVar = this.f4967j;
        gVar.set(i2, obj);
        this.f4968k = gVar.g();
        b();
    }
}
