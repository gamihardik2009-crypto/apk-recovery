package m2;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: m2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0869k implements InterfaceC0862d, Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8649j = AtomicReferenceFieldUpdater.newUpdater(C0869k.class, Object.class, "i");

    /* renamed from: h, reason: collision with root package name */
    public volatile y2.a f8650h;

    /* renamed from: i, reason: collision with root package name */
    public volatile Object f8651i;

    @Override // m2.InterfaceC0862d
    public final Object getValue() {
        Object obj = this.f8651i;
        C0877s c0877s = C0877s.f8656a;
        if (obj != c0877s) {
            return obj;
        }
        y2.a aVar = this.f8650h;
        if (aVar != null) {
            Object c3 = aVar.c();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8649j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0877s, c3)) {
                if (atomicReferenceFieldUpdater.get(this) != c0877s) {
                }
            }
            this.f8650h = null;
            return c3;
        }
        return this.f8651i;
    }

    public final String toString() {
        return this.f8651i != C0877s.f8656a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
