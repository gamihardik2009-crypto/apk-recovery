package R0;

import java.util.UUID;

/* loaded from: classes.dex */
public final class e extends z2.i implements y2.a {

    /* renamed from: j, reason: collision with root package name */
    public static final e f5398j = new e(0, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f5399k = new e(0, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f5400l = new e(0, 2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5401i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i2, int i3) {
        super(i2);
        this.f5401i = i3;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f5401i) {
        }
        return UUID.randomUUID();
    }
}
