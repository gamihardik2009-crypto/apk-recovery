package N;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: j, reason: collision with root package name */
    public final Object[] f4965j;

    /* renamed from: k, reason: collision with root package name */
    public final k f4966k;

    public h(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        super(i2, i3);
        this.f4965j = objArr2;
        int i5 = (i3 - 1) & (-32);
        this.f4966k = new k(objArr, i2 > i5 ? i5 : i2, i5, i4);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        k kVar = this.f4966k;
        if (kVar.hasNext()) {
            this.f4946h++;
            return kVar.next();
        }
        int i2 = this.f4946h;
        this.f4946h = i2 + 1;
        return this.f4965j[i2 - kVar.f4947i];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f4946h;
        k kVar = this.f4966k;
        int i3 = kVar.f4947i;
        if (i2 <= i3) {
            this.f4946h = i2 - 1;
            return kVar.previous();
        }
        int i4 = i2 - 1;
        this.f4946h = i4;
        return this.f4965j[i4 - i3];
    }
}
