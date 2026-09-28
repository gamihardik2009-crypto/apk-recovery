package j;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0745a extends AbstractSet {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0750f f7985h;

    public C0745a(C0750f c0750f) {
        this.f7985h = c0750f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0748d(this.f7985h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7985h.f7975j;
    }
}
