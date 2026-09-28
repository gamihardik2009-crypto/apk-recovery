package A0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final y2.a f31a;

    /* renamed from: b, reason: collision with root package name */
    public final y2.a f32b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33c;

    public i(y2.a aVar, y2.a aVar2, boolean z3) {
        this.f31a = aVar;
        this.f32b = aVar2;
        this.f33c = z3;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f31a.c()).floatValue() + ", maxValue=" + ((Number) this.f32b.c()).floatValue() + ", reverseScrolling=" + this.f33c + ')';
    }
}
