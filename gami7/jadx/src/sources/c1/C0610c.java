package c1;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: c1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0610c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0610c f7288c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0610c f7289d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0610c f7290e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0610c f7291f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0610c f7292g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0610c f7293h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0610c f7294i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0610c f7295j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f7296a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7297b;

    static {
        new C0610c(null, 1, null, null);
        new C0610c(null, 2, null, null);
        new C0610c(null, 4, null, null);
        new C0610c(null, 8, null, null);
        new C0610c(null, 16, null, null);
        new C0610c(null, 32, null, null);
        f7288c = new C0610c(null, 64, null, null);
        f7289d = new C0610c(null, 128, null, null);
        new C0610c(null, 256, null, AbstractC0617j.class);
        new C0610c(null, 512, null, AbstractC0617j.class);
        new C0610c(null, 1024, null, AbstractC0618k.class);
        new C0610c(null, 2048, null, AbstractC0618k.class);
        f7290e = new C0610c(null, 4096, null, null);
        f7291f = new C0610c(null, 8192, null, null);
        new C0610c(null, 16384, null, null);
        new C0610c(null, 32768, null, null);
        new C0610c(null, 65536, null, null);
        new C0610c(null, 131072, null, AbstractC0622o.class);
        new C0610c(null, 262144, null, null);
        new C0610c(null, 524288, null, null);
        new C0610c(null, 1048576, null, null);
        new C0610c(null, 2097152, null, AbstractC0623p.class);
        int i2 = Build.VERSION.SDK_INT;
        new C0610c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new C0610c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, AbstractC0620m.class);
        f7292g = new C0610c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        f7293h = new C0610c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        f7294i = new C0610c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        f7295j = new C0610c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        new C0610c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null);
        new C0610c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null);
        new C0610c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null);
        new C0610c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null);
        new C0610c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        new C0610c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, AbstractC0621n.class);
        new C0610c(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, AbstractC0619l.class);
        new C0610c(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null);
        new C0610c(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null);
        new C0610c(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null);
        new C0610c(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null);
        new C0610c(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null);
        new C0610c(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null);
        new C0610c(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null);
        new C0610c(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null);
        new C0610c(i2 >= 34 ? AbstractC0613f.a() : null, R.id.accessibilityActionScrollInDirection, null, null);
    }

    public C0610c(String str, int i2) {
        this(null, i2, str, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0610c)) {
            return false;
        }
        Object obj2 = ((C0610c) obj).f7296a;
        Object obj3 = this.f7296a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f7296a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String c3 = C0615h.c(this.f7297b);
        if (c3.equals("ACTION_UNKNOWN")) {
            Object obj = this.f7296a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                c3 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(c3);
        return sb.toString();
    }

    public C0610c(Object obj, int i2, String str, Class cls) {
        this.f7297b = i2;
        if (obj == null) {
            this.f7296a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
        } else {
            this.f7296a = obj;
        }
    }
}
