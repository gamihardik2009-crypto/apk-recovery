package B1;

import java.util.Set;
import m.AbstractC0837j;
import n2.C0972x;
import t0.AbstractC1265x;

/* renamed from: B1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014d {

    /* renamed from: i, reason: collision with root package name */
    public static final C0014d f274i = new C0014d(1, false, false, false, false, -1, -1, C0972x.f9167h);

    /* renamed from: a, reason: collision with root package name */
    public final int f275a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f276b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f277c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f278d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f279e;

    /* renamed from: f, reason: collision with root package name */
    public final long f280f;

    /* renamed from: g, reason: collision with root package name */
    public final long f281g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f282h;

    public C0014d(int i2, boolean z3, boolean z4, boolean z5, boolean z6, long j3, long j4, Set set) {
        AbstractC1265x.f("requiredNetworkType", i2);
        z2.h.f(set, "contentUriTriggers");
        this.f275a = i2;
        this.f276b = z3;
        this.f277c = z4;
        this.f278d = z5;
        this.f279e = z6;
        this.f280f = j3;
        this.f281g = j4;
        this.f282h = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !z2.h.a(C0014d.class, obj.getClass())) {
            return false;
        }
        C0014d c0014d = (C0014d) obj;
        if (this.f276b == c0014d.f276b && this.f277c == c0014d.f277c && this.f278d == c0014d.f278d && this.f279e == c0014d.f279e && this.f280f == c0014d.f280f && this.f281g == c0014d.f281g && this.f275a == c0014d.f275a) {
            return z2.h.a(this.f282h, c0014d.f282h);
        }
        return false;
    }

    public final int hashCode() {
        int d3 = ((((((((AbstractC0837j.d(this.f275a) * 31) + (this.f276b ? 1 : 0)) * 31) + (this.f277c ? 1 : 0)) * 31) + (this.f278d ? 1 : 0)) * 31) + (this.f279e ? 1 : 0)) * 31;
        long j3 = this.f280f;
        int i2 = (d3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f281g;
        return this.f282h.hashCode() + ((i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + t.B(this.f275a) + ", requiresCharging=" + this.f276b + ", requiresDeviceIdle=" + this.f277c + ", requiresBatteryNotLow=" + this.f278d + ", requiresStorageNotLow=" + this.f279e + ", contentTriggerUpdateDelayMillis=" + this.f280f + ", contentTriggerMaxDelayMillis=" + this.f281g + ", contentUriTriggers=" + this.f282h + ", }";
    }

    public C0014d(C0014d c0014d) {
        z2.h.f(c0014d, "other");
        this.f276b = c0014d.f276b;
        this.f277c = c0014d.f277c;
        this.f275a = c0014d.f275a;
        this.f278d = c0014d.f278d;
        this.f279e = c0014d.f279e;
        this.f282h = c0014d.f282h;
        this.f280f = c0014d.f280f;
        this.f281g = c0014d.f281g;
    }
}
