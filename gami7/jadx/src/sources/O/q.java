package O;

/* loaded from: classes.dex */
public final class q extends o {

    /* renamed from: k, reason: collision with root package name */
    public final h f5131k;

    public q(h hVar) {
        this.f5131k = hVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f5129j;
        this.f5129j = i2 + 2;
        Object[] objArr = this.f5127h;
        return new b(this.f5131k, objArr[i2], objArr[i2 + 1]);
    }
}
