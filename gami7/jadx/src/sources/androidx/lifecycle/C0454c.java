package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0454c {

    /* renamed from: a, reason: collision with root package name */
    public final int f6883a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f6884b;

    public C0454c(int i2, Method method) {
        this.f6883a = i2;
        this.f6884b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0454c)) {
            return false;
        }
        C0454c c0454c = (C0454c) obj;
        return this.f6883a == c0454c.f6883a && this.f6884b.getName().equals(c0454c.f6884b.getName());
    }

    public final int hashCode() {
        return this.f6884b.getName().hashCode() + (this.f6883a * 31);
    }
}
