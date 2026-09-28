package R0;

import m.AbstractC0837j;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5429a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5430b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5431c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5432d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5433e;

    public s(boolean z3, boolean z4, int i2, boolean z5, boolean z6) {
        this.f5429a = z3;
        this.f5430b = z4;
        this.f5431c = i2;
        this.f5432d = z5;
        this.f5433e = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f5429a == sVar.f5429a && this.f5430b == sVar.f5430b && this.f5431c == sVar.f5431c && this.f5432d == sVar.f5432d && this.f5433e == sVar.f5433e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5433e) + B1.t.f((AbstractC0837j.d(this.f5431c) + B1.t.f(Boolean.hashCode(this.f5429a) * 31, 31, this.f5430b)) * 31, 31, this.f5432d);
    }

    public /* synthetic */ s(int i2, boolean z3) {
        this(true, true, 1, z3, (i2 & 16) != 0);
    }

    public s(int i2) {
        this(true, true, 1, (i2 & 4) != 0, true);
    }

    public /* synthetic */ s() {
        this(true, true, 1, true, true);
    }
}
