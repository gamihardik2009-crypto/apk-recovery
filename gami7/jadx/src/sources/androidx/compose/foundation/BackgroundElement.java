package androidx.compose.foundation;

import B1.t;
import V.n;
import c0.AbstractC0598q;
import c0.C0564D;
import c0.C0603v;
import c0.InterfaceC0576P;
import n.C0907o;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
final class BackgroundElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final long f6544b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0598q f6545c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6546d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0576P f6547e;

    public BackgroundElement(long j3, C0564D c0564d, float f3, InterfaceC0576P interfaceC0576P, int i2) {
        j3 = (i2 & 1) != 0 ? C0603v.f7277g : j3;
        c0564d = (i2 & 2) != 0 ? null : c0564d;
        this.f6544b = j3;
        this.f6545c = c0564d;
        this.f6546d = f3;
        this.f6547e = interfaceC0576P;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && C0603v.c(this.f6544b, backgroundElement.f6544b) && h.a(this.f6545c, backgroundElement.f6545c) && this.f6546d == backgroundElement.f6546d && h.a(this.f6547e, backgroundElement.f6547e);
    }

    public final int hashCode() {
        int i2 = C0603v.f7278h;
        int hashCode = Long.hashCode(this.f6544b) * 31;
        AbstractC0598q abstractC0598q = this.f6545c;
        return this.f6547e.hashCode() + t.c(this.f6546d, (hashCode + (abstractC0598q != null ? abstractC0598q.hashCode() : 0)) * 31, 31);
    }

    @Override // t0.S
    public final n l() {
        C0907o c0907o = new C0907o();
        c0907o.f8816u = this.f6544b;
        c0907o.f8817v = this.f6545c;
        c0907o.f8818w = this.f6546d;
        c0907o.f8819x = this.f6547e;
        c0907o.f8820y = 9205357640488583168L;
        return c0907o;
    }

    @Override // t0.S
    public final void m(n nVar) {
        C0907o c0907o = (C0907o) nVar;
        c0907o.f8816u = this.f6544b;
        c0907o.f8817v = this.f6545c;
        c0907o.f8818w = this.f6546d;
        c0907o.f8819x = this.f6547e;
    }
}
