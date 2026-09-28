package B1;

import android.net.Uri;

/* renamed from: B1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013c {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f272a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f273b;

    public C0013c(boolean z3, Uri uri) {
        this.f272a = uri;
        this.f273b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!z2.h.a(C0013c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        z2.h.d(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        C0013c c0013c = (C0013c) obj;
        return z2.h.a(this.f272a, c0013c.f272a) && this.f273b == c0013c.f273b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273b) + (this.f272a.hashCode() * 31);
    }
}
