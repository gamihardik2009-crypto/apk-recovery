package g1;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f7756a;

    /* renamed from: b, reason: collision with root package name */
    public t f7757b;

    public s(int i2) {
        this.f7756a = new SparseArray(i2);
    }

    public final void a(t tVar, int i2, int i3) {
        int a3 = tVar.a(i2);
        SparseArray sparseArray = this.f7756a;
        s sVar = sparseArray == null ? null : (s) sparseArray.get(a3);
        if (sVar == null) {
            sVar = new s(1);
            sparseArray.put(tVar.a(i2), sVar);
        }
        if (i3 > i2) {
            sVar.a(tVar, i2 + 1, i3);
        } else {
            sVar.f7757b = tVar;
        }
    }
}
