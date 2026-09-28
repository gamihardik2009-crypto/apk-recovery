package H0;

import B1.t;
import n2.AbstractC0963o;

/* loaded from: classes.dex */
public final class k implements Comparable {

    /* renamed from: i, reason: collision with root package name */
    public static final k f3400i;

    /* renamed from: j, reason: collision with root package name */
    public static final k f3401j;

    /* renamed from: k, reason: collision with root package name */
    public static final k f3402k;

    /* renamed from: l, reason: collision with root package name */
    public static final k f3403l;

    /* renamed from: m, reason: collision with root package name */
    public static final k f3404m;

    /* renamed from: h, reason: collision with root package name */
    public final int f3405h;

    static {
        k kVar = new k(100);
        k kVar2 = new k(200);
        k kVar3 = new k(300);
        k kVar4 = new k(400);
        k kVar5 = new k(500);
        k kVar6 = new k(600);
        f3400i = kVar6;
        k kVar7 = new k(700);
        k kVar8 = new k(800);
        k kVar9 = new k(900);
        f3401j = kVar4;
        f3402k = kVar5;
        f3403l = kVar7;
        f3404m = kVar8;
        AbstractC0963o.v(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9);
    }

    public k(int i2) {
        this.f3405h = i2;
        if (1 > i2 || i2 >= 1001) {
            throw new IllegalArgumentException(t.h("Font weight can be in range [1, 1000]. Current value: ", i2).toString());
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return z2.h.g(this.f3405h, ((k) obj).f3405h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f3405h == ((k) obj).f3405h;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3405h;
    }

    public final String toString() {
        return t.j(new StringBuilder("FontWeight(weight="), this.f3405h, ')');
    }
}
