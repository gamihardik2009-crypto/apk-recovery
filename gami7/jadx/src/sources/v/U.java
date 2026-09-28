package v;

import j.AbstractC0738D;
import j.C0768x;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final C0768x f11324a;

    /* renamed from: b, reason: collision with root package name */
    public final C0768x f11325b;

    /* renamed from: c, reason: collision with root package name */
    public long f11326c;

    /* renamed from: d, reason: collision with root package name */
    public long f11327d;

    public U() {
        int i2 = AbstractC0738D.f7970a;
        this.f11324a = new C0768x(6);
        this.f11325b = new C0768x(6);
    }

    public static final long a(U u3, long j3, long j4) {
        if (j4 == 0) {
            return j3;
        }
        long j5 = 4;
        return (j3 / j5) + ((j4 / j5) * 3);
    }
}
