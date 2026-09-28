package J2;

import java.util.concurrent.CancellationException;

/* renamed from: J2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4416a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0309f f4417b;

    /* renamed from: c, reason: collision with root package name */
    public final y2.c f4418c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4419d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f4420e;

    public C0318o(Object obj, AbstractC0309f abstractC0309f, y2.c cVar, Object obj2, Throwable th) {
        this.f4416a = obj;
        this.f4417b = abstractC0309f;
        this.f4418c = cVar;
        this.f4419d = obj2;
        this.f4420e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0318o a(C0318o c0318o, AbstractC0309f abstractC0309f, CancellationException cancellationException, int i2) {
        Object obj = c0318o.f4416a;
        if ((i2 & 2) != 0) {
            abstractC0309f = c0318o.f4417b;
        }
        AbstractC0309f abstractC0309f2 = abstractC0309f;
        y2.c cVar = c0318o.f4418c;
        Object obj2 = c0318o.f4419d;
        CancellationException cancellationException2 = cancellationException;
        if ((i2 & 16) != 0) {
            cancellationException2 = c0318o.f4420e;
        }
        c0318o.getClass();
        return new C0318o(obj, abstractC0309f2, cVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0318o)) {
            return false;
        }
        C0318o c0318o = (C0318o) obj;
        return z2.h.a(this.f4416a, c0318o.f4416a) && z2.h.a(this.f4417b, c0318o.f4417b) && z2.h.a(this.f4418c, c0318o.f4418c) && z2.h.a(this.f4419d, c0318o.f4419d) && z2.h.a(this.f4420e, c0318o.f4420e);
    }

    public final int hashCode() {
        Object obj = this.f4416a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC0309f abstractC0309f = this.f4417b;
        int hashCode2 = (hashCode + (abstractC0309f == null ? 0 : abstractC0309f.hashCode())) * 31;
        y2.c cVar = this.f4418c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Object obj2 = this.f4419d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f4420e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f4416a + ", cancelHandler=" + this.f4417b + ", onCancellation=" + this.f4418c + ", idempotentResume=" + this.f4419d + ", cancelCause=" + this.f4420e + ')';
    }

    public /* synthetic */ C0318o(Object obj, AbstractC0309f abstractC0309f, y2.c cVar, CancellationException cancellationException, int i2) {
        this(obj, (i2 & 2) != 0 ? null : abstractC0309f, (i2 & 4) != 0 ? null : cVar, (Object) null, (i2 & 16) != 0 ? null : cancellationException);
    }
}
