package H2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements G2.g {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f3433a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3434b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3435c;

    /* renamed from: d, reason: collision with root package name */
    public final y2.e f3436d;

    public b(CharSequence charSequence, int i2, int i3, k kVar) {
        z2.h.f(charSequence, "input");
        this.f3433a = charSequence;
        this.f3434b = i2;
        this.f3435c = i3;
        this.f3436d = kVar;
    }

    @Override // G2.g
    public final Iterator iterator() {
        return new a(this);
    }
}
