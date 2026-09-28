package w0;

import J2.r;
import android.R;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import b0.d;
import m.AbstractC0837j;
import n1.C0944e;
import z2.h;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1378b {

    /* renamed from: a, reason: collision with root package name */
    public final y2.a f11433a;

    /* renamed from: b, reason: collision with root package name */
    public d f11434b;

    /* renamed from: c, reason: collision with root package name */
    public y2.a f11435c;

    /* renamed from: d, reason: collision with root package name */
    public y2.a f11436d;

    /* renamed from: e, reason: collision with root package name */
    public y2.a f11437e;

    /* renamed from: f, reason: collision with root package name */
    public y2.a f11438f;

    public C1378b(C0944e c0944e) {
        d dVar = d.f7059e;
        this.f11433a = c0944e;
        this.f11434b = dVar;
        this.f11435c = null;
        this.f11436d = null;
        this.f11437e = null;
        this.f11438f = null;
    }

    public static void a(int i2, Menu menu) {
        int i3;
        int d3 = AbstractC0837j.d(i2);
        int d4 = AbstractC0837j.d(i2);
        if (d4 == 0) {
            i3 = R.string.copy;
        } else if (d4 == 1) {
            i3 = R.string.paste;
        } else if (d4 == 2) {
            i3 = R.string.cut;
        } else {
            if (d4 != 3) {
                throw new r();
            }
            i3 = R.string.selectAll;
        }
        menu.add(0, d3, AbstractC0837j.d(i2), i3).setShowAsAction(1);
    }

    public static void b(Menu menu, int i2, y2.a aVar) {
        if (aVar != null && menu.findItem(AbstractC0837j.d(i2)) == null) {
            a(i2, menu);
        } else {
            if (aVar != null || menu.findItem(AbstractC0837j.d(i2)) == null) {
                return;
            }
            menu.removeItem(AbstractC0837j.d(i2));
        }
    }

    public final boolean c(ActionMode actionMode, MenuItem menuItem) {
        h.c(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            y2.a aVar = this.f11435c;
            if (aVar != null) {
                aVar.c();
            }
        } else if (itemId == 1) {
            y2.a aVar2 = this.f11436d;
            if (aVar2 != null) {
                aVar2.c();
            }
        } else if (itemId == 2) {
            y2.a aVar3 = this.f11437e;
            if (aVar3 != null) {
                aVar3.c();
            }
        } else {
            if (itemId != 3) {
                return false;
            }
            y2.a aVar4 = this.f11438f;
            if (aVar4 != null) {
                aVar4.c();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    public final void d(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu".toString());
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode".toString());
        }
        if (this.f11435c != null) {
            a(1, menu);
        }
        if (this.f11436d != null) {
            a(2, menu);
        }
        if (this.f11437e != null) {
            a(3, menu);
        }
        if (this.f11438f != null) {
            a(4, menu);
        }
    }
}
